This app simply takes in a website and regex replacement via a query string and sends you to the website created with the regex replacement.
It also takes a boolean at the end to say if it is replaceFirst() or replaceALL() (true for all, false for first).

For example: '/changeURL?URL=http://xkcd.com/1333/&REGEX=http://&REPLACE=m.&ALL=true' would forward you to m.xkcd.com/1333