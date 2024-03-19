CREATE OR REPLACE procedure delete_student(p_email varchar2)
is 
    v_id number(4);
begin
     v_id := get_student_id(p_email);
     delete from gpa_history 
     where student_id = v_id;
     delete from has
     where student_id = v_id;
     delete from student_phones
     where student_id = v_id;
     delete from students
     where email = p_email;
     commit;
end;
show errors;