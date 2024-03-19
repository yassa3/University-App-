CREATE OR REPLACE procedure insert_student_phones(p_email varchar2,p_phone varchar2)
is 
     v_student_id number(4);
begin
    v_student_id := get_student_id(p_email);
    
    insert into student_Phones
    values
    (v_student_id,p_phone);
end;
show errors;