CREATE OR REPLACE procedure insert_teach(p_email varchar2,p_course_code varchar2)
is 
    v_course_id number(3);
    v_doctor_id number(4);
begin
    v_course_id := get_course_id(p_course_code);
    v_doctor_id := get_doctor_id(p_email);
    
    insert into teach
    values
    (v_doctor_id,v_course_id);
end;
show errors;