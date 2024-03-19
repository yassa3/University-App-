CREATE OR REPLACE procedure insert_take (p_email varchar2,p_course_code varchar2)
is
    v_course_id number(3);
    v_student_id number(4);
begin
    v_course_id := get_course_id(p_course_code);
    v_student_id := get_student_id(p_email);
    insert into has
    (student_id,course_id,datee)
    values
    (v_student_id,v_course_id,sysdate);
end;
show errors;