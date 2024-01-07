create table if not exists app_user (
    id identity,
    phone_number varchar(15) not null,
    password varchar(32) not null,
    role varchar(64) not null,
    surname varchar(32) not null,
    firstname varchar(32) not null,
    middlename varchar(32) not null,
    specialization varchar(32) not null
);

create table if not exists office (
    id identity,
    type varchar(32) not null,
    floor smallint not null,
    number smallint not null
);

create table if not exists appointment (
    id identity,
    doctor_id bigint not null,
    patient_id bigint not null,
    appointment_date date not null,
    start_time time not null,
    end_time time not null
);

create table if not exists schedule (
    id identity
    doctor_id bigint not null,
    office_id bigint not null,
    start_date date not null,
    end_date date not null,
    start_time json not null,
    end_time json not null
);

alter table appointment add foreign key (doctor_id) references app_user(id)
alter table appointment add foreign key (patient_id) references app_user(id)
alter table schedule add foreign key (doctor_id) references app_user(id)
alter table schedule add foreign key (office_id) references office(id)