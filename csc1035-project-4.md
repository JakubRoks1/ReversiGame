---
title:  Assessment 4 - Brown coding project
author: Sergiy Bogomolov, Kostiantyn Potomkin
---

# Overview

This assignment further develops your experience with "brown coding".
Brown coding experience is a significant asset for professional
programmers, because most industries have a large in-house code base
that needs to be maintained. Unfortunately, brown coding comes with its
own peculiar challenges: because you are not the original author of the
code, it might use coding styles, libraries, or language features that
you are not that accustomed with. Also, you typically do not know which
parts of the code base the original developer trusted or may have been
doubtful about.

## Learning outcomes

In particular, you will learn:

 * to understand a substantial code base by studying its code
 * to familiarise yourself with testing and debugging in java
 * to triangulate errors in a code base and come up with fixes
 * to document your changes in meaningful and isolated commits


## Specification

For this assignment, we have created a Java project for you on nucode
which you can see at
**<https://nucode.ncl.ac.uk/scomp/stage1/csc1035/coursework/assessment-4-brown-coding-project >**.
You should fork this project, so that
you have your own copy and then clone it into your local environment so
that you can edit it.

The file `README.md` gives a general description how the program is
supposed to behave. The main package of the programme is `uk.ac.ncl`
with the `Main.java` as the main file.


The code base provided to you contains some errors.  Your job is to
identify and fix these issues.  Note that that errors might be in the
code, the test suit as well as in the inline documentation.  **At the
same time, we do not expect you to find any bugs in `ui` package**.

Fixes should be committed individually with descriptive
commit messages.

**Hint:** We are aware of at least 15 errors.

## Marking Criteria

The submission will be allocated marks for:

 * fixes in the code base (75%)
 * isolated commits with meaningful commit messages (25%)

## Deliverables

Your coursework must be submitted to the NESS system by the deadline
specified. Please note that NESS imposes deadlines rigorously, and
even work that is a few seconds late (e.g. because of network delays
caused by students all submitting at the last moment) will be flagged
as late. Please allow for at least 15 minutes to upload your files.

You should submit to NESS a zip file containing the following:

- Your Java project source code (i.e. all of your .java files)
- Your Word/PDF documentation with the NUCode URL of your last commit
  ("HEAD") to NESS (please ensure that the URL includes a Git hash)
