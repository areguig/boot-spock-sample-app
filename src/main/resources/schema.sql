-- (country, name, state, map)
create table city (
       country varchar,
       name varchar,
       state varchar,
       map varchar
);

-- hotel(city_id, name, address, zip) values (1, 'Conrad Treasury Place', 'William & George Streets', '4001')
create table hotel(
    city_id int,
    name varchar,
    address varchar,
    zip varchar
);

-- review(hotel_id, idx, check_in_date, rating, trip_type, title, details) values (2, 3, '2009-01-20', 3, 2, 'Nice clean rooms', 'The rooms are maintained to a high standard and very clean, the bathroom was spotless!!')

create table review(
    hotel_id int,
    idx int,
    check_in_date date,
    rating int,
    trip_type int,
    title varchar,
    details varchar
);