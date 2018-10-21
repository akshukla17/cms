--This file contains DDL file for food web_catalog

create table web_catalog( catalog_id varchar(40), name varchar(80),type varchar(20),creation_date DATETIME,description varchar(254));

create table category(category_id varchar(40) not null primary key, name varchar(80) not null, description varchar(254), catalog_id varchar(40) not null,category_type varchar(20), parent_cat_id varchar(40),long_descrption BLOB,creation_date DATETIME,root_category boolean);
-- foreign key yet to be decided
create table cat_child_cats(cat_id varchar(40) not null,child_cat_id varchar(40) not null, primary key (cat_id)); 

create table product( product_id varchar(40) not null primary key,name varchar(80) not null,description varchar(254),long_descrption BLOB,creation_date DATETIME, parent_cat_id varchar(40) not null);
create table cat_child_product(cat_id varchar(40) not null primary key,child_prod_id varchar(40) not null);
