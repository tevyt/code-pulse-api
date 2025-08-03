drop table if exists app_user;

create table app_user (
    id integer not null,
    username varchar(50) not null,
    github_access_token varchar(100) not null
    primary key (id)
);