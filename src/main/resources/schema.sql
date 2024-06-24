--usersがあれば削除
DROP TABLR IF EXISTS users;

--usersがなければ新しく作成
CREATE TABLE IF NOT EXISTS users(
user_id VARCHAR(20) NOT NULL,
user_pw VARCHAR(10) NOT NULL,
user_name VARCHAR(20) NOT NULL,
email VARCHAR(20) NOT NULL,
icon_img BLOB,
create_date DATE NOT NULL,
update_date DATE NOT NULL,
delete_flg BOOLEAN,
PRIMARY KEY(user_id)
);

--postsがあれば削除
DROP TABLR IF EXISTS posts;

--postsがなければ新しく作成
CREATE TABLE IF NOT EXISTS posts(
id INT AUTO_INCREMENTE,
user_id VARCHAR(20) NOT NULL,
post_content VARCHAR(100) NOT NULL,
post_img BLOB,
perent_id VARCHAR(10),
create_date DATE NOT NULL,
update_date DATE NOT NULL,
delete_flg BOOLEAN,
PRIMARY KEY (id),
FOREIGN KEY (user_id) REFERENCES users(user_id)
);
