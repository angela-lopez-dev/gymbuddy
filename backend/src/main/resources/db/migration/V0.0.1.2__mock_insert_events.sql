insert into application.users (first_name, last_name, login)
values('Dimitri', 'Payet', 'dimpayet974');

insert into application.users(first_name, last_name, login)
values('Bamba', 'Dieng', 'bamba');

insert into application.users(first_name, last_name, login)
values ('Alexis', 'Sanchez', 'alexis');

insert into application.activities(code, label, description)
values('football','Football','Most popular sport in the world innit');

insert into application.events(activity_id, date, organizer_id, title, description, location)
values('football', '2023-02-12',1, 'Five a side', 'Tackles allowed, no offsides', 'At home');

