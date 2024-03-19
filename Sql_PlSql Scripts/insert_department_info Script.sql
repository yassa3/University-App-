CREATE OR REPLACE procedure insert_department_info(p_department_name varchar2,  p_department_code varchar2)
is 
begin
    insert into departments
    (department_id,department_name,department_code)
    values
    (department_seq.nextval,p_department_name,p_department_code);
end;
show errors;