# *Library Management System*

## Requirements

- Classes: `Library`, `Book`, `Member` (with `StudentMember`, `TeacherMember`).
- Use **composition** (`Library HAS-A List<Book>`).
- Store books in a `Map<ISBN, Book>`.
- ISBN can be a String
- Features: add/remove books, search by title, list members.
- You can override equals and hashCode methods