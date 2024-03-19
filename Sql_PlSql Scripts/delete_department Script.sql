create or replace procedure delete_department(p_department_code varchar2)
is 
begin
     delete from departments
     where department_code = p_department_code;
     commit;
end;
show errors;