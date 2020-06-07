FROM python:3.7
RUN git clone https://github.com/chuckchuck-gojol/wiing-wiing.git /backend_code
WORKDIR /backend_code
RUN pip install -r requirements.txt
ENTRYPOINT gunicorn --bind 0.0.0.0:5000 app:app