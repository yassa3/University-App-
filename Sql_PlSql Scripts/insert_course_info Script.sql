CREATE OR REPLACE procedure insert_course_info(p_course_name varchar2, p_hours number, p_course_code varchar2, p_semester varchar2,p_department_code varchar2)
is 
    v_dept_id number(3);
begin
    v_dept_id := get_dept_id(p_department_code);
    insert into courses
    (course_id,course_name,hours,course_code,semester,department_id)
    values
    (course_seq.nextval,p_course_name,p_hours,p_course_code,p_semester,v_dept_id);
end;
show errors;