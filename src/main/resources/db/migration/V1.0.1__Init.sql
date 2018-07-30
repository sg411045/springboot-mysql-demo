CREATE TABLE EMPLOYEE (
    id          INT NOT NULL,
    department  VARCHAR(50) NOT NULL,
    emp_name    VARCHAR(50) NOT NULL,
    emp_no      VARCHAR(50) NOT NULL UNIQUE,
    PRIMARY KEY(id)
);

CREATE INDEX idx_emp_no
    ON EMPLOYEE (emp_no);