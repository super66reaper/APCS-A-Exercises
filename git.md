# Git

## One Time Setup

`$ git config --global user.name "Matthew Johnson"`
`$ git config --global user.email "super66reaper@gmail.com"`

## Project Setup

git init
touch .gitignore
Add *.class to the .gitignore
git add.
git commit-m "Initial Commit"

## 3 Step Repeating Commit Process
1. Make changes to code
2. Stage related changes
    * git add
3. Commit changes with a message
    * git commit -m "Message"

## Commands

* status -> tell me what files have been staged or commited
* add -> add a file to the stage
* rm --cached -> remove file from stage
* git commit -m "Present tence discription of what changed"
* git log -> Enter to move down, q to quit
* git checkout -- filename -> discard changes

## Problems

* Commit without -m -> Use esc:wq Enter
* Wrong message -> git commit --amend -m "New Message"
* wrong commit -> git checkout COMMIT_ID