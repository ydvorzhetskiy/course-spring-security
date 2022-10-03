-- Companies
-- TODO: rename to clients!!
insert into company(id, name)
values (1001, 'Amazon'),
       (1002, 'IBM'),
       (1003, 'Oracle');

-- Users
insert into user(id, login, password)
values (2001, 'user1', 'password'),
       (2002, 'user2', 'password'),
       (2003, 'admin', 'password');

-- User roles
insert into user_roles(user_id, roles)
values (2001, 'user'),
       (2002, 'user'),
       (2002, 'manager'),
       (2003, 'admin');

-- User-Company
insert into user_company(user_id, companies_id)
values (2001, 1001),
       (2001, 1002),
       (2002, 1003),
       (2003, 1001),
       (2003, 1002),
       (2003, 1003);
