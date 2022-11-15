import streamlit as st
import sqlite3
from controllers.user_controller import UserController as uc

with st.form(key="porra"):
    email = st.text_input("email")
    username = st.text_input("username")
    password = st.text_input("password")
    input_button = st.form_submit_button("sign up")

controler = uc()
if input_button:
    controler.addUser(username, password, email)
