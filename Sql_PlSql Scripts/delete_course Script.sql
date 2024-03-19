create or replace procedure delete_course(p_course_code varchar2)
is 
    v_id number(5);
begin
     v_id := get_course_id(p_course_code);
     delete from has
     where course_id = v_id;
     delete from teach
     where course_id = v_id; 
     delete from courses
     where course_code = p_course_code;
     commit;
end;
show errors;