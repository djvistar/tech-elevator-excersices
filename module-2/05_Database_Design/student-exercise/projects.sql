

DROP TABLE IF EXISTS projects;
DROP TABLE IF EXISTS employees;
DROP TABLE IF EXISTS job_titlest;
DROP TABLE IF EXISTS departments;

BEGIN TRANSACTION;

CREATE TABLE departments (
        id serial,
        name varchar(255) NOT NULL UNIQUE,
        CONSTRAINT pk_departments_id PRIMARY KEY (id)   
 );

CREATE TABLE job_titles (
        id serial,
        title varchar(255) NOT NULL UNIQUE,
        CONSTRAINT pk_job_titles_id PRIMARY KEY (id)       
);
 
CREATE TABLE employees (
        id serial,
        first_name varchar(255) NOT NULL,
        last_name varchar(255) NOT NULL,
        gender char(1),
        birthday date,
        hireday date NOT NULL,
        departments_id integer NOT NULL,
        job_titles_id integer NOT NULL,
        CONSTRAINT pk_employees_id PRIMARY KEY (id),
        CONSTRAINT fk_job_titles_id FOREIGN KEY (job_titles_id) REFERENCES job_titles(id),
        CONSTRAINT fk_departments_id FOREIGN KEY (departments_id) REFERENCES departments(id)
);

CREATE TABLE projects (
        id serial,
        name varchar(255) NOT NULL UNIQUE,
        employees_id integer NOT NULL,
        startdate date NOT NULL,
        CONSTRAINT pk_projects_id PRIMARY KEY (id),
        CONSTRAINT fk_employees_id FOREIGN KEY (employees_id) REFERENCES employees(id)
);

 INSERT INTO departments (name) VALUES ('Human Resources');
 INSERT INTO departments (name) VALUES ('Finance'); 
 INSERT INTO departments (name) VALUES ('Project Management');
 INSERT INTO departments (name) VALUES ('Reasearch and Development');
 
 INSERT INTO job_titles (title) VALUES ('Director');
 INSERT INTO job_titles (title) VALUES ('Manager');
 INSERT INTO job_titles (title) VALUES ('Associate');
 INSERT INTO job_titles (title) VALUES ('Developer');
 
 INSERT INTO employees (first_name,last_name,hireday,departments_id,job_titles_id) VALUES ('John','Doe','1995-09-08',8,1);
INSERT INTO employees (first_name,last_name,hireday,departments_id,job_titles_id) VALUES ('Smith','Dre','2012-01-01',5,3);
INSERT INTO employees (first_name,last_name,hireday,departments_id,job_titles_id) VALUES ('Mike','Jones','2013-01-01',5,3);
INSERT INTO employees (first_name,last_name,hireday,departments_id,job_titles_id) VALUES ('Nini','White','2014-01-01',8,2);
INSERT INTO employees (first_name,last_name,hireday,departments_id,job_titles_id) VALUES ('Brandon','Smih','2015-01-01',6,4);
INSERT INTO employees (first_name,last_name,hireday,departments_id,job_titles_id) VALUES ('John','Dave','2006-01-01',6,3);
INSERT INTO employees (first_name,last_name,hireday,departments_id,job_titles_id) VALUES ('Lulu','Moe','2007-01-01',7,4);
INSERT INTO employees (first_name,last_name,hireday,departments_id,job_titles_id) VALUES ('Jun','june','2019-01-01',7,1); 

INSERT INTO projects (name,employees_id,startdate) VALUES ('Miccheck',6,'2013-06-10');
INSERT INTO projects (name,employees_id,startdate) VALUES ('Creative',20,'2011-09-10');
INSERT INTO projects (name,employees_id,startdate) VALUES ('Research',67,'2009-06-11');
INSERT INTO projects (name,employees_id,startdate) VALUES ('Final',38,'2017-08-10');


SELECT * FROM job_titles
SELECT * FROM departments
SELECT * FROM employees
SELECT * FROM projects

 ROLLBACK;
 
 COMMIT;




