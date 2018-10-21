---This file contains DML for food web_catalog

insert into web_catalog(catalog_id,name,type,creation_date,description)values('catalog101','food catalog','root',now(),'food root catalog');

------category Info------------------
insert into category(category_id,name,description,catalog_id,category_type,parent_cat_id,long_descrption,creation_date,root_category)
values('cat104','Lunch Menu','It contains meal packet with various option','catelog101','','','',now(),true);


insert into category(category_id,name,description,catalog_id,creation_date,root_category)
values('cat105','Snacks','It contains light-weight food options','catelog101',now(),false);

insert into category(category_id,name,description,catalog_id,creation_date,root_category)
values('cat106','Indian breads','It contains various option of Indian style breads','catelog101',now(),true);

insert into category(category_id,name,description,catalog_id,creation_date,root_category,category_type)
values('cat102','Healthy Diet','this category contains food which is good for health','catelog101',now(),true,'root');


insert into category(category_id,name,description,catalog_id,creation_date,root_category)
values('cat101','Spicy','this category contains spicy food options','catelog101',now(),true);


insert into category(category_id,name,description,catalog_id,creation_date,root_category,category_type)
values('cat103','Secret','It contains food which will be deliever as part of surprise package when user order more that specific amount','catelog101',now(),true,'root');

insert into category(category_id,name,description,catalog_id,creation_date,root_category,category_type)
values('cat107','Veggie','It continas various gravy options for you','catelog101',now(),true,'child');
-------------product Info------------------

insert into product (product_id,name,description,creation_date,parent_cat_id)
values('prod107','Litti-Chokha','It is very delicious food contans 3 Litti (with ghee), chokha, onion, fried green chilly.',now(),'cat102');

insert into product (product_id,name,description,creation_date,parent_cat_id)
values('prod113','Vegitable Pulav','It is special rice and various vegetables combination .',now(),'cat108');


insert into product (product_id,name,description,creation_date,parent_cat_id)
values('prod104','Lunch meal chapati combo','It contains 2 chapati, bowl of rice, 1 type of veggi, salad.',now(),'cat104');


insert into product (product_id,name,description,creation_date,parent_cat_id)
values('prod105','Lunch H meal chapati combo','It contains 2 chapati,  good amount of SALAD, 1 veggie with curd.',now(),'cat102');

insert into product (product_id,name,description,creation_date,parent_cat_id)
values('prod109','Fulka','It is most likely Indian bread.',now(),'cat106');

update product set list_price=60 where product_id='prod113';
