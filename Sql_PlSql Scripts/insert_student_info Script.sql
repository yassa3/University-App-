CREATE OR REPLACE procedure insert_student_info(p_fname varchar2, p_lname varchar2,p_email varchar2,p_DoB date,p_gender varchar2, p_semester varchar2,p_city varchar2,p_street varchar2,p_department_code varchar2)
is 
    v_id number(3);
begin
    v_id := get_dept_id(p_department_code);
    
    insert into students
    (student_id,fname,lname,email,DoB,Gender,semester,city,street,department_id)
    values
    (student_seq.nextval,p_fname,p_lname,p_email,p_DoB,p_gender,p_semester,p_city,p_street,v_id);
end;
show errors;