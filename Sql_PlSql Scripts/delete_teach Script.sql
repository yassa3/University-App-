CREATE OR REPLACE procedure delete_teach(p_email varchar2,p_course_code varchar2)
is 
    v_course_id number(3);
    v_doctor_id number(4);
begin
    v_course_id := get_course_id(p_course_code);
    v_doctor_id := get_doctor_id(p_email);
     delete from teach
     where doctor_id = v_doctor_id and course_id = v_course_id;
end;