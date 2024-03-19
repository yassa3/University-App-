CREATE OR REPLACE procedure upd_course_info(p_course_code varchar2,p_hours number, p_semester varchar2,p_department_code varchar2)
is 
    v_dept_id number(3);
begin
    v_dept_id := get_dept_id(p_department_code);
    update courses
    set Hours = p_hours,
         Semester = p_semester,
         department_id = v_dept_id
    where Course_code = p_course_code;
end;
show errors;