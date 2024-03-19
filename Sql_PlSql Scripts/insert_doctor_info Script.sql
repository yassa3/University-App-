CREATE OR REPLACE procedure insert_doctor_info(p_fname varchar2, p_lname varchar2,p_email varchar2,p_department_code varchar2)
is 
    v_id number(3);
begin
    v_id := get_dept_id(p_department_code);
    
    insert into doctors
    values
    (doctor_seq.nextval,p_fname,p_lname,p_email,v_id);
end;
show errors;