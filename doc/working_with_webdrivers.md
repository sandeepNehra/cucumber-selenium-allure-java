 
#General info  

Default browser to use in test is chrome. If no browser is selected, chrome will be picked up. 
This framework uses WebDriver hub to execute the tests. Selenium provides docker standalone images for popular browsers like chrome, firefox, edge etc. Below steps are for a machine/VM (act as webdriver hub) with docker installed.

# Firefox
To try firefox docker selenium container:   
1. docker run -d -p 4446:4444 -p 5902:5900 --shm-size="2g" -e SCREEN_WIDTH=1920 -e SCREEN_HEIGHT=1080 -v /dev/shm:/dev/shm --name selenium_wd_chrome selenium/standalone-firefox 
2. Set **wd_hub_url** in selenium.properties to http://*docker_host_IP*:4446/
3. Pass "-Dbrowser=firefox" param for mvn, while test is executed  
4. To view the firefox browser window of the container, use in your VNC client: *docker_host_IP*:5902

# Chrome
To try chrome docker selenium container:   
1. docker run -d -p 4444:4444 -p 5900:5900 --shm-size="2g" -e SCREEN_WIDTH=1920 -e SCREEN_HEIGHT=1080 -v /dev/shm:/dev/shm --name selenium_wd_chrome selenium/standalone-chrome 
2. Set **wd_hub_url** in selenium.properties to http://*docker_host_IP*:4444/
3. Pass "-Dbrowser=chrome" param for mvn, while test is executed  
4. To view the chrome browser window of the container, use in your VNC client: *docker_host_IP*:5900

# Edge
To try edge docker selenium container:   
1. docker run -d -p 4445:4444 -p 5901:5900 --shm-size="2g" -e SCREEN_WIDTH=1920 -e SCREEN_HEIGHT=1080 -v /dev/shm:/dev/shm --name selenium_wd_chrome selenium/standalone-edge 
2. Set **wd_hub_url** in selenium.properties to http://*docker_host_IP*:4445/
3. Pass "-Dbrowser=edge" param for mvn, while test is executed  
4. To view the edge browser window of the container, use in your VNC client: *docker_host_IP*:5901


For more info on the selenium docker project, checkout [docker-selenium github](https://github.com/SeleniumHQ/docker-selenium)