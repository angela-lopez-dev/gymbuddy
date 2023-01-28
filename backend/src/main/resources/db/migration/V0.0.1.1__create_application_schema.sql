create schema application;

create table application.users(
    id serial primary key,
    first_name TEXT not null,
    last_name TEXT not null,
    login TEXT not null
);

create table application.activities (
    code VARCHAR(255) primary key,
    label TEXT not null,
    description TEXT
);

create table application.events(
    id serial primary key,
    activity_id VARCHAR(255) not null,
    date DATE not null,
    organizer_id INT not null,
    title TEXT not null,
    description TEXT,
    location TEXT not null
);

alter table application.events add constraint fk_activity_id foreign key (activity_id) references application.activities(code);
alter table application.events add constraint fk_organizer_id foreign key (organizer_id) references application.users(id);


