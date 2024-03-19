create or replace function get_dept_id (p_department_code varchar2)
return number
is
    v_id number(3);
begin 
    select department_id 
    into v_id 
    from departments
    where department_code = p_department_code;
    return v_id;
end;
show errors;

create or replace function get_student_id (p_email varchar2)
return number
is
    v_id number(3);
begin 
    select student_id 
    into v_id 
    from students
    where email = p_email;
    return v_id;
end;
show errors;

create or replace function get_doctor_id (p_email varchar2)
return number
is
    v_id number(3);
begin 
    select doctor_id 
    into v_id 
    from doctors
    where email = p_email;
    return v_id;
end;
show errors;

create or replace function get_course_id (p_course_code varchar2)
return number
is
    v_id number(3);
begin 
    select course_id 
    into v_id 
    from courses
    where course_code = p_course_code;
    return v_id;
end;
show errors;