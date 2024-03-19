create or replace procedure delete_doctor(p_email varchar2)
is 
     v_id number(5);
begin
      v_id := get_doctor_id(p_email);
     delete from teach
     where doctor_id = v_id;
     delete from doctors
     where email = p_email;
     commit;
end;
show errors;
