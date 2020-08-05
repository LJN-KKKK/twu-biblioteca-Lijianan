INSERT INTO book
VALUES (11, "The Pragmatic Programmer");

INSERT INTO member
VALUES (43, "KKKK");

INSERT INTO checkout_item
VALUES (43, 11, NULL);

SELECT member.name
FROM member, checkout_item, book
WHERE member.id = checkout_item.member_id
AND checkout_item.book_id = book.id
AND book.title = "The Pragmatic Programmer";