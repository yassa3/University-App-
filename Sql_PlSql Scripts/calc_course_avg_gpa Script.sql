CREATE OR REPLACE function calc_course_avg_gpa (p_course_code varchar2)
return number
is
    v_gpa number(4,2);
    v_grades number(3,1);
    v_sum number(8) := 0;
    v_sum_grades number(8,2) := 0;
    v_course_id number (4) := get_course_id(p_course_code);
    cursor has_info is
        select student_id, grade 
        from has
        where course_id = v_course_id;
    
begin 
    for has_record in has_info loop
        select grade_points
        into v_grades
        from grades
        where grade = has_record.grade;
         v_sum_grades := v_sum_grades + (v_grades);
         v_sum := v_sum + 1;
        
    end loop;
    v_gpa := round((v_sum_grades/v_sum),2);
    return v_gpa;
end;