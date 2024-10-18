CREATE TABLE "public".employees (
  id bigserial primary key,
  name text NOT NULL,
  employee_type text NOT NULL,
  salary bigint,
  hours_worked int,
  hourly_rate bigint
);