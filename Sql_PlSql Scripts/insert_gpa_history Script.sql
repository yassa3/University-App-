CREATE OR REPLACE TRIGGER insert_gpa_history
after update of semester ON UNIVERSITY.STUDENTS for each row
begin 
    insert into gpa_history
    values
    (:old.student_id,:old.semester,:new.gpa,sysdate);
end;