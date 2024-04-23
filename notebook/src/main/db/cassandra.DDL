describe keyspace;

create table student
(
    id        int primary key,
    name      text,
    age       int,
    gender    int,
    address   text,
    interest set<text>,
    phone     list<text>,
    education map<text,
    text>
);

-- drop table student;

insert into student (id, name, age, gender, address,
                     interest,
                     phone,
                     education)
values (1, 'Rob', 33, 1, 'shanghai',
           {'basketball', 'swimming'},
           ['12345678901'],
           {'primary' : 'huacao', 'middle':'huacao', 'high':'xinge', 'colleague':'donghua'});

select *
from student;

delete
from student
where id = 1;