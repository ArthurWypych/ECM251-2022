import streamlit as st
from controllers.user_controller import UserController as uc
from models.user import User

with st.form(key="porra"):
    email = st.text_input("email")
    username = st.text_input("username")
    password = st.text_input("password")
    input_button = st.form_submit_button("sign up")

new_user = User(username, email, None)

if 'sign_ups' not in st.session_state:
    st.session_state['sign ups'] = new_user

controler = uc()
controler.addUserCsv(username, password)
