---
title: Starting development with JavaFX
layout: post
author: joe
tags: javafx
---

I started development this weekend, and I'm starting this dev blog today, to keep track of what I learn along the way.

The language is Java (version 13 at this time, although I plan to stay on the latest versions), and the UI framework is JavaFX.  I know there's a JavaFX game engine, [FXGL](https://github.com/AlmasB/FXGL), but I'd rather roll my own at this point.

## Starting at the beginning

I decided to begin with the splash page and main menu, that is, right at the beginning.  In JavaFX you can define a UI using a static FXML file and CSS files, so all the Java code is still in one class for now.  These two lines load the two screens:

```java
    Parent splashpage = FXMLLoader.load(getClass().getResource("/scenes/splashpage.fxml"));
    Parent mainmenu = FXMLLoader.load(getClass().getResource("/scenes/mainmenu.fxml"));
```

I want a dark-theme window, but by default JavaFX uses the titlebar of the underlying operating system, which is generally a light color.  I've been using an undecorated window, then, with a black background.

```java
    public void start(Stage stage) throws IOException {
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("A Star Too Far");
        stage.setHeight(480);
        stage.setWidth(640);
        stage.setMaximized(true);
        ...
    }
```

I'm finding "`setMaximized`" isn't platform-agnostic.  It takes the full screen (obscuring the toolbar) on Windows, but on Linux Mint the app's window is only 640x480.  So I'm dropping it.  I think I need to develop my own tool bar that can allow the window to be moved and has buttons to maximize, close, and to go to fullscreen mode.

The next order of business is to figure out the keyboard events for the menu screen, so users can move through the options and select one. ("Quit" seems to be the logical one to start with.)  It seems that there will be many game "states" with different keyboard controls so I may want to come up with a way to encapsulate the controls with a game state.




