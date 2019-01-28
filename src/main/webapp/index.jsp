<html>
<head>
    <title>Questionnaire</title>
</head>
<body>
<h2>Hello! Enter the answers to several questions</h2>
<form action="http://localhost:8080/WebQuestionnaire_war_exploded/QuestionnaireeServlet" method="POST">
<br/>
<br/>
 <strong>Have you lern Java start?</strong>
<br/><input type="radio" name="question1" value="yes" /> Yes
<br/><input type="radio" name="question1" value="no" /> No
<br/>
<br/>
<strong>Have you lern Java OOP?</strong>
<br/><input type="radio" name="question2" value="yes" /> Yes
<br/><input type="radio" name="question2" value="no" /> No
<br/>
<br/>
<strong>Have you understand it?</strong>
<br/><input type="radio" name="question3" value="yes" /> Yes
<br/><input type="radio" name="question3" value="no" /> No
<br/>
<br/>
<strong>Have you paid for Java Pro?</strong>
<br/><input type="radio" name="question4" value="yes" /> Yes
<br/><input type="radio" name="question4" value="no" /> No
    <br/>
    <br/>
    <strong>enter your name</strong>
    <input type="text" name="question5" />
    <br/>
    <br/>

    <input type="submit" />
</form>
</body>
</html>
