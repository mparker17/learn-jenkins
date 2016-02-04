FROM jenkins:latest

# Download the Jenkins plugins we want to use. Note that we must specify both
# the plugins we want to use and their dependencies.
COPY plugins.txt /usr/share/jenkins/plugins.txt
RUN /usr/local/bin/plugins.sh /usr/share/jenkins/plugins.txt
