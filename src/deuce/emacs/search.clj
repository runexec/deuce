(ns
 deuce.emacs.search
 (:use [deuce.emacs-lisp :only (defun defvar)])
 (:refer-clojure :exclude []))

(defvar inhibit-changing-match-data nil
  "Internal use only.
  If non-nil, the primitive searching and matching functions
  such as `looking-at', `string-match', `re-search-forward', etc.,
  do not set the match data.  The proper way to use this variable
  is to bind it with `let' around a small expression.")

(defvar search-spaces-regexp nil
  "Regexp to substitute for bunches of spaces in regexp search.
  Some commands use this for user-specified regexps.
  Spaces that occur inside character classes or repetition operators
  or other such regexp constructs are not replaced with this.
  A value of nil (which is the normal value) means treat spaces literally.")

(defun word-search-regexp (string &optional lax)
  "Return a regexp which matches words, ignoring punctuation.
  Given STRING, a string of words separated by word delimiters,
  compute a regexp that matches those exact words separated by
  arbitrary punctuation.  If LAX is non-nil, the end of the string
  need not match a word boundary unless it ends in whitespace.
  
  Used in `word-search-forward', `word-search-backward',
  `word-search-forward-lax', `word-search-backward-lax'."
  )

(defun search-forward (string &optional bound noerror count)
  "Search forward from point for STRING.
  Set point to the end of the occurrence found, and return point.
  An optional second argument bounds the search; it is a buffer position.
  The match found must not extend after that position.  A value of nil is
    equivalent to (point-max).
  Optional third argument, if t, means if fail just return nil (no error).
    If not nil and not t, move to limit of search and return nil.
  Optional fourth argument COUNT, if non-nil, means to search for COUNT
   successive occurrences.  If COUNT is negative, search backward,
   instead of forward, for -COUNT occurrences.
  
  Search case-sensitivity is determined by the value of the variable
  `case-fold-search', which see.
  
  See also the functions `match-beginning', `match-end' and `replace-match'."
  )

(defun re-search-backward (regexp &optional bound noerror count)
  "Search backward from point for match for regular expression REGEXP.
  Set point to the beginning of the match, and return point.
  The match found is the one starting last in the buffer
  and yet ending before the origin of the search.
  An optional second argument bounds the search; it is a buffer position.
  The match found must start at or after that position.
  Optional third argument, if t, means if fail just return nil (no error).
    If not nil and not t, move to limit of search and return nil.
  Optional fourth argument is repeat count--search for successive occurrences.
  
  Search case-sensitivity is determined by the value of the variable
  `case-fold-search', which see.
  
  See also the functions `match-beginning', `match-end', `match-string',
  and `replace-match'."
  )

(defun set-match-data (list &optional reseat)
  "Set internal data on last search match from elements of LIST.
  LIST should have been created by calling `match-data' previously.
  
  If optional arg RESEAT is non-nil, make markers on LIST point nowhere."
  )

(defun word-search-forward-lax (string &optional bound noerror count)
  "Search forward from point for STRING, ignoring differences in punctuation.
  Set point to the end of the occurrence found, and return point.
  
  Unlike `word-search-forward', the end of STRING need not match a word
  boundary, unless STRING ends in whitespace.
  
  An optional second argument bounds the search; it is a buffer position.
  The match found must not extend after that position.
  Optional third argument, if t, means if fail just return nil (no error).
    If not nil and not t, move to limit of search and return nil.
  Optional fourth argument is repeat count--search for successive occurrences.
  
  Relies on the function `word-search-regexp' to convert a sequence
  of words in STRING to a regexp used to search words without regard
  to punctuation."
  )

(defun word-search-backward (string &optional bound noerror count)
  "Search backward from point for STRING, ignoring differences in punctuation.
  Set point to the beginning of the occurrence found, and return point.
  An optional second argument bounds the search; it is a buffer position.
  The match found must not extend before that position.
  Optional third argument, if t, means if fail just return nil (no error).
    If not nil and not t, move to limit of search and return nil.
  Optional fourth argument is repeat count--search for successive occurrences.
  
  Relies on the function `word-search-regexp' to convert a sequence
  of words in STRING to a regexp used to search words without regard
  to punctuation."
  )

(defun posix-search-forward (regexp &optional bound noerror count)
  "Search forward from point for regular expression REGEXP.
  Find the longest match in accord with Posix regular expression rules.
  Set point to the end of the occurrence found, and return point.
  An optional second argument bounds the search; it is a buffer position.
  The match found must not extend after that position.
  Optional third argument, if t, means if fail just return nil (no error).
    If not nil and not t, move to limit of search and return nil.
  Optional fourth argument is repeat count--search for successive occurrences.
  
  Search case-sensitivity is determined by the value of the variable
  `case-fold-search', which see.
  
  See also the functions `match-beginning', `match-end', `match-string',
  and `replace-match'."
  )

(defun word-search-forward (string &optional bound noerror count)
  "Search forward from point for STRING, ignoring differences in punctuation.
  Set point to the end of the occurrence found, and return point.
  An optional second argument bounds the search; it is a buffer position.
  The match found must not extend after that position.
  Optional third argument, if t, means if fail just return nil (no error).
    If not nil and not t, move to limit of search and return nil.
  Optional fourth argument is repeat count--search for successive occurrences.
  
  Relies on the function `word-search-regexp' to convert a sequence
  of words in STRING to a regexp used to search words without regard
  to punctuation."
  )

(defun word-search-backward-lax (string &optional bound noerror count)
  "Search backward from point for STRING, ignoring differences in punctuation.
  Set point to the beginning of the occurrence found, and return point.
  
  Unlike `word-search-backward', the end of STRING need not match a word
  boundary, unless STRING ends in whitespace.
  
  An optional second argument bounds the search; it is a buffer position.
  The match found must not extend before that position.
  Optional third argument, if t, means if fail just return nil (no error).
    If not nil and not t, move to limit of search and return nil.
  Optional fourth argument is repeat count--search for successive occurrences.
  
  Relies on the function `word-search-regexp' to convert a sequence
  of words in STRING to a regexp used to search words without regard
  to punctuation."
  )

(defun looking-at (regexp)
  "Return t if text after point matches regular expression REGEXP.
  This function modifies the match data that `match-beginning',
  `match-end' and `match-data' access; save and restore the match
  data if you want to preserve them."
  )

(defun re-search-forward (regexp &optional bound noerror count)
  "Search forward from point for regular expression REGEXP.
  Set point to the end of the occurrence found, and return point.
  An optional second argument bounds the search; it is a buffer position.
  The match found must not extend after that position.
  Optional third argument, if t, means if fail just return nil (no error).
    If not nil and not t, move to limit of search and return nil.
  Optional fourth argument is repeat count--search for successive occurrences.
  
  Search case-sensitivity is determined by the value of the variable
  `case-fold-search', which see.
  
  See also the functions `match-beginning', `match-end', `match-string',
  and `replace-match'."
  )

(defun posix-string-match (regexp string &optional start)
  "Return index of start of first match for REGEXP in STRING, or nil.
  Find the longest match, in accord with Posix regular expression rules.
  Case is ignored if `case-fold-search' is non-nil in the current buffer.
  If third arg START is non-nil, start search at that index in STRING.
  For index of first char beyond the match, do (match-end 0).
  `match-end' and `match-beginning' also give indices of substrings
  matched by parenthesis constructs in the pattern."
  )

(defun string-match (regexp string &optional start)
  "Return index of start of first match for REGEXP in STRING, or nil.
  Matching ignores case if `case-fold-search' is non-nil.
  If third arg START is non-nil, start search at that index in STRING.
  For index of first char beyond the match, do (match-end 0).
  `match-end' and `match-beginning' also give indices of substrings
  matched by parenthesis constructs in the pattern.
  
  You can use the function `match-string' to extract the substrings
  matched by the parenthesis constructions in REGEXP."
  )

(defun posix-looking-at (regexp)
  "Return t if text after point matches regular expression REGEXP.
  Find the longest match, in accord with Posix regular expression rules.
  This function modifies the match data that `match-beginning',
  `match-end' and `match-data' access; save and restore the match
  data if you want to preserve them."
  )

(defun match-data (&optional integers reuse reseat)
  "Return a list containing all info on what the last search matched.
  Element 2N is `(match-beginning N)'; element 2N + 1 is `(match-end N)'.
  All the elements are markers or nil (nil if the Nth pair didn't match)
  if the last match was on a buffer; integers or nil if a string was matched.
  Use `set-match-data' to reinstate the data in this list.
  
  If INTEGERS (the optional first argument) is non-nil, always use
  integers (rather than markers) to represent buffer positions.  In
  this case, and if the last match was in a buffer, the buffer will get
  stored as one additional element at the end of the list.
  
  If REUSE is a list, reuse it as part of the value.  If REUSE is long
  enough to hold all the values, and if INTEGERS is non-nil, no consing
  is done.
  
  If optional third arg RESEAT is non-nil, any previous markers on the
  REUSE list will be modified to point to nowhere.
  
  Return value is undefined if the last search failed."
  )

(defun replace-match (newtext &optional fixedcase literal string subexp)
  "Replace text matched by last search with NEWTEXT.
  Leave point at the end of the replacement text.
  
  If second arg FIXEDCASE is non-nil, do not alter case of replacement text.
  Otherwise maybe capitalize the whole text, or maybe just word initials,
  based on the replaced text.
  If the replaced text has only capital letters
  and has at least one multiletter word, convert NEWTEXT to all caps.
  Otherwise if all words are capitalized in the replaced text,
  capitalize each word in NEWTEXT.
  
  If third arg LITERAL is non-nil, insert NEWTEXT literally.
  Otherwise treat `\\' as special:
    `\\&' in NEWTEXT means substitute original matched text.
    `\\N' means substitute what matched the Nth `\\(...\\)'.
         If Nth parens didn't match, substitute nothing.
    `\\\\' means insert one `\\'.
  Case conversion does not apply to these substitutions.
  
  FIXEDCASE and LITERAL are optional arguments.
  
  The optional fourth argument STRING can be a string to modify.
  This is meaningful when the previous match was done against STRING,
  using `string-match'.  When used this way, `replace-match'
  creates and returns a new string made by copying STRING and replacing
  the part of STRING that was matched.
  
  The optional fifth argument SUBEXP specifies a subexpression;
  it says to replace just that subexpression with NEWTEXT,
  rather than replacing the entire matched text.
  This is, in a vague sense, the inverse of using `\\N' in NEWTEXT;
  `\\N' copies subexp N into NEWTEXT, but using N as SUBEXP puts
  NEWTEXT in place of subexp N.
  This is useful only after a regular expression search or match,
  since only regular expressions have distinguished subexpressions."
  )

(defun match-beginning (subexp)
  "Return position of start of text matched by last search.
  SUBEXP, a number, specifies which parenthesized expression in the last
    regexp.
  Value is nil if SUBEXPth pair didn't match, or there were less than
    SUBEXP pairs.
  Zero means the entire text matched by the whole regexp or whole string."
  )

(defun search-backward (string &optional bound noerror count)
  "Search backward from point for STRING.
  Set point to the beginning of the occurrence found, and return point.
  An optional second argument bounds the search; it is a buffer position.
  The match found must not extend before that position.
  Optional third argument, if t, means if fail just return nil (no error).
   If not nil and not t, position at limit of search and return nil.
  Optional fourth argument COUNT, if non-nil, means to search for COUNT
   successive occurrences.  If COUNT is negative, search forward,
   instead of backward, for -COUNT occurrences.
  
  Search case-sensitivity is determined by the value of the variable
  `case-fold-search', which see.
  
  See also the functions `match-beginning', `match-end' and `replace-match'."
  )

(defun match-end (subexp)
  "Return position of end of text matched by last search.
  SUBEXP, a number, specifies which parenthesized expression in the last
    regexp.
  Value is nil if SUBEXPth pair didn't match, or there were less than
    SUBEXP pairs.
  Zero means the entire text matched by the whole regexp or whole string."
  )

(defun posix-search-backward (regexp &optional bound noerror count)
  "Search backward from point for match for regular expression REGEXP.
  Find the longest match in accord with Posix regular expression rules.
  Set point to the beginning of the match, and return point.
  The match found is the one starting last in the buffer
  and yet ending before the origin of the search.
  An optional second argument bounds the search; it is a buffer position.
  The match found must start at or after that position.
  Optional third argument, if t, means if fail just return nil (no error).
    If not nil and not t, move to limit of search and return nil.
  Optional fourth argument is repeat count--search for successive occurrences.
  
  Search case-sensitivity is determined by the value of the variable
  `case-fold-search', which see.
  
  See also the functions `match-beginning', `match-end', `match-string',
  and `replace-match'."
  )

(defun regexp-quote (string)
  "Return a regexp string which matches exactly STRING and nothing else."
  )
