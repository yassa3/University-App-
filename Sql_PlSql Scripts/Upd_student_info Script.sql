CREATE OR REPLACE procedure upd_student_info(p_email varchar2,p_old_phone varchar2,p_new_phone varchar2, p_semester varchar2, p_city varchar2,p_street varchar2,p_department_code varchar2)
is 
     v_dept_id number(3);
     v_student_id number(4);
begin
    v_dept_id := get_dept_id(p_department_code);
    
    update students
    set    Semester = p_semester,
            City =  p_city,
            Street = p_street,
            department_id = v_dept_id
    where email = p_email;
    
    v_student_id := get_student_id(p_email);
    
    update Student_Phones
    set phone = p_new_phone 
    where student_id = v_student_id
    and phone = p_old_phone;
end;
show errors;