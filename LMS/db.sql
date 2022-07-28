create table lms_role(
role_id int,
title varchar(50) not null,
primary key (role_id)
);

create table lms_users(
user_id int,
user_name varchar(100) not null,
role_id int not null,
primary key (user_id),
foreign key (role_id) references lms_role(role_id)
);

create table lms_asset_type(
asset_type_id char(5),
asset_type_name varchar(50) not null,
primary key (asset_type_id)
);

create table lms_assets(
asset_id int,
asset_title varchar(100) not null,
asset_type_id char(5) not null,
primary key (asset_id),
foreign key (asset_type_id) references lms_asset_type(asset_type_id)
);

insert into lms_role(role_id, title) values
(1, 'Admin'),
(2, 'Librarian'),
(3, 'User');

insert into lms_users(user_id, user_name, role_id) values
(101, 'Rohan', 1),
(102, 'Amit', 2),
(103, 'Mohan', 1),
(104, 'Sohan', 3),
(105, 'Geeta', 2),
(106, 'Rita', 3),
(107, 'Madhu', 2),
(108, 'Abhishek', 3),
(109, 'Raju', 3),
(110, 'Mukesh', 3),
(111, 'Saurabh', 3),
(112, 'Samantha', 3),
(113, 'Suman', 3),
(114, 'Hiran', 3),
(115, 'Vikas', 3),
(116, 'Vashung', 3),
(117, 'Sweta', 3),
(118, 'Somya', 3),
(119, 'Varalakshmi', 3),
(120, 'Nathan', 3),
(121, 'Shilpa', 3),
(122, 'Arvind', 3),
(123, 'Deepa', 3),
(124, 'Atit', 3),
(125, 'Jamuna', 3);




