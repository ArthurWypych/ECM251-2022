import streamlit as st
from controllers.user_controller import UserController as uc
from models.user import User

with st.form(key="porra2"):

    col1, col2, col3 = st.columns(3)
    
    with col2:
        st.markdown("")
        st.write("")
        st.image("assets/thomas_login.jpg", width = 200)

    with col3:
        st.image("assets/mr_rob_banks.jpg", width = 50)

    name = st.text_input("Name")
    password = st.text_input("Password")
    test_user = User(name, password, None)
    input_button = st.form_submit_button("log the fuck in")

contro = uc()

if contro.checkLoginCsv(name, password):
    st.write("loged in!!")

# if st.session_state['sign_ups'] == test_user:
#     st.write('loged in!!')
# else: 
#     st.write("user not found")