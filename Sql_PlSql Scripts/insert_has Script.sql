CREATE OR REPLACE procedure insert_has (p_email varchar2,p_course_code varchar2,p_grade varchar2)
is
    v_course_id number(3);
    v_student_id number(4);
begin
    v_course_id := get_course_id(p_course_code);
    v_student_id := get_student_id(p_email);
    update has 
    set grade = p_grade
    where student_id = v_student_id
    and course_id = v_course_id;
end;
show errors;