<!DOCTYPE html>
<html lang="en">
<head>
	<title>GR12</title>
	<meta charset="utf-8" />
	<meta name="layout" content="main">	  
</head>

<body>

	<div class="container">
    <div class="shadow left"></div>
    <div class="main">
      <h1>Forum</h1>
      <div id="content"></div>
    </div>            
    <div class="shadow right"></div>
  </div> 

<!-- Templates -->

<script type="text/template" id="tpl_thread_list">
    <h2 class="centered">Threads</h2>
            
    <ul class="thread_list"></ul>

    <h2>New Thread</h2>
    <ul>
        <li>Title: <input type="text" class="new_thread_title" /></li>
        <li>Author: <input class="new_message_author" type="text" /></li>
        <li>Message: <textarea class="new_message_text" /></li>
        <li><input type="submit" class="new_thread_submit" value="Create thread" /></li>
    </ul>
    <div class="error_message"></div>
</script>

<script type="text/template" id="tpl_thread_summary">
    <span class="thread_title">{{title}}</span> 
    <span class="thread_nb_messages">{{messages.length}} messages</span>
</script>

<script type="text/template" id="tpl_thread">
    <h2 class="centered">Thread - "{{title}}"</h2>

    <div class="message_list"></div>

    <h2>New message</div>
    <ul>
        <li>Author: <input class="new_message_author" type="text" /></li>
        <li>Text: <textarea class="new_message_text" /></li>
    </ul>
    <input type="submit" value="Post message" />
    </ul>
    <div class="error_message"></div>
</script>

<script type="text/template" id="tpl_message">
    <div class="message">
        <div class="message_author">By: {{author}}</div>
        <div class="message_text">{{text}}</div>
    </div>
</script>

<script type="text/javascript" src="<g:createLinkTo dir='js' file='forum.js' />" ></script>
 
<script type="text/javascript">
    (function($) {
        $.forum.bootstrap();       
    })(jQuery);
</script>

</body>
</html>
