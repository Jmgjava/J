drop table group1;

create table group1(
    name varchar2(100) not null, --�̸�
    price number not null,
    depart varchar2(100) not null -- �μ�
);

insert into group1(name,price,depart) values('m1',1000,'������');
insert into group1(name,price,depart) values('m2',2000,'������');
insert into group1(name,price,depart) values('m3',1500,'��ȹ��');
insert into group1(name,price,depart) values('m4',3660,'��ȹ��');
insert into group1(name,price,depart) values('m5',5800,'ȫ����');
insert into group1(name,price,depart) values('m6',4480,'ȫ����');

commit;

select * from group1;

-- �μ�����
select depart from group1 group by depart;

-- �μ����� �ݾ��� �հ�
select depart, sum(price) as �μ����հ� from group1 group by  depart;
-- �μ����� �ݾ��� �հ� �μ��� �հ谡 ���������� ����(��������)
select depart, sum(price) as �μ����հ�
from group1
group by depart
order by �μ����հ� desc;
-- �μ����� �ݾ��� �հ� �μ��� �հ谡 5000ũ�� �հ谡 ���� ������ ����
select depart, sum(price) as �μ����հ�
from group1
group by depart
having sum(price) > 5000
order by �μ����հ� desc;

-- �μ����� �ݾ��� ���
select depart, round(avg(price),2) as �μ������ from group1 group by  depart;
-- �μ����� ����� 2000 �ʰ��� �μ��� �μ��� ����� ���������� ����
select depart, round(avg(price),2) as �μ������
from group1
group by depart
having round(avg(price),2) > 2000
order by �μ������ desc;

select depart, count(price) as �μ������� from group1 group by  depart;

-- �μ��� �ִ밪
select depart, max(price) as �μ����ִ밪 from group1 group by  depart;
-- �μ����� �ݾ��� �ִ밪�� 3000 �̻��� �μ��� ���������� ����
select depart, max(price) as �μ����ִ밪
from group1
group by depart
having max(price) >=3000
order by �μ����ִ밪 asc;

-- �μ��� �ּҰ�
select depart, min(price) as �μ����ּҰ� from group1 group by  depart;

select depart, sum(price) as �μ����հ�, round( avg(price),2) as �μ������, max(price) as �μ����ִ밪
from group1 group by depart;




 


