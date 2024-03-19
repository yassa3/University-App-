create or replace function calc_gpa (p_email varchar2)
return number
is
    v_gpa number(4,2);
    v_hours number(1);
    v_grades number(3,1);
    v_sum number(8,2) := 0;
    v_sum_hours number(8) := 0;
    v_student_id number (4) := get_student_id(p_email);
    cursor has_info is
        select course_id, grade 
        from has
        where student_id = v_student_id and grade is not null;
    
begin 
    for has_record in has_info loop 
        select hours
        into v_hours
        from courses
        where course_id = has_record.course_id;
        
        select grade_points
        into v_grades
        from grades
        where grade = has_record.grade;
         v_sum := v_sum + (v_grades * v_hours);
         v_sum_hours := v_sum_hours + v_hours;
        
    end loop;
    v_gpa := round((v_sum/v_sum_hours),2);
    update students
    set gpa = v_gpa
    where student_id = v_student_id;
   return v_gpa;
end;
show errors;