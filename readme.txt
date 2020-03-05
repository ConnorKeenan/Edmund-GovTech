Edmunds GovTech – Programming challenge for Java Developer 

Question 1)
Write a program that reads in a name and outputs an ID based on the name. The ID should be uppercase and
formatted using the first three letters of the name and three digits starting at 005. The digits should be
incremented by 5 if an ID already exists.

Sample input:
Jen
Jen
Tom
Vito
Jennifer

Sample output:
JEN005
JEN010
TOM005
VIT005
JEN015

Question 2)
Write a program to parse the attached CSV file and print each field on a separate line. Fields are separated by
commas. Commas within quotes should be treated as part of the string and NOT as a delimiter. Quotes should
not be printed as part of the string.

Output:
1
John Doe
1 Country Lane Northfield NJ 08225
2
Jane Doe
14 Main Street Northfield, NJ 08225
3
Doe, Joe
900 Broad Street Northfield NJ 08225 

Question 3)
Write a program that will format phone numbers and social security numbers. Phone numbers should be
formatted as: (123)456-7890. Social security numbers should be formatted as: 123-45-6789. The program
should read in two values from the user. The first value should be 1 for phone number or 2 for social security
number. The second value is the input that will be formatted. The program should continue accepting input until
the user enters Q to quit. If the second value is not the correct length (phone numbers should be 10 digits, social
security numbers should be 9), print an error message to the user.

Sample input:
1
6096457333
1
609645733
2
111223333
2
1112233334

Sample output:
(609)645-7333
Error! Phone numbers should be 10 digits long.
111-22-3333
Error! Social security numbers should be 9 digits long. 
