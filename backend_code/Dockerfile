FROM python:3.7
CMD git pull https://github.com/chuckchuck-gojol/wiing-wiing.git
CMD git checkout feature/minjeong/10
CMD cd backend_code
CMD pip install -r requirements.txt
ENTRYPOINT gunicorn --bind 0.0.0.0:5000 app:app