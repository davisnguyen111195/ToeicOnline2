CREATE DATABASE IF NOT EXISTS DB1;

USE DB1;

CREATE TABLE role (
	roleId bigint NOT NULL PRIMARY KEY,
    roleName VARCHAR(70) NOT NULL
) ENGINE = INNODB;

CREATE TABLE users (
	usersId bigint NOT NULL PRIMARY KEY,
    usersName VARCHAR(70) NOT NULL,
    roleId bigint,
    FOREIGN KEY (roleId) REFERENCES role(roleId)
) ENGINE = INNODB;

create table listenguideline (
	listenguidelineId bigint not null primary key auto_increment,
	title varchar(512) null,
	image varchar(255) null,
	content text null,
	createddate timestamp null,
	modifieddate timestamp null
)ENGINE = INNODB;

create table comment(
	commentId bigint not null primary key auto_increment,
	content text null,
	usersId bigint null,
	foreign key (usersId) references users(usersId),
	listenguidelineId bigint null,
	foreign key (listenguidelineId) references listenguideline(listenguidelineId),
	createddate timestamp null
)ENGINE = INNODB;

