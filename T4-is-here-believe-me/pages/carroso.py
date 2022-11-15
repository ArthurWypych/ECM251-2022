import streamlit as st

col0, col1, col2, col3, col4 = st.columns([3,10,3,2,3])

with col4:
    if 'count' not in st.session_state:
        st.session_state.count = 0

    increment = st.button('Add')
    if increment:
        st.session_state.count += 1

with col3:
    st.write('qtd ', st.session_state.count)

with col2:
    if 'count' not in st.session_state:
        st.session_state.count = 0

    decrement = st.button("Remove")
    if decrement:
        st.session_state.count -= 1

with col1:
    st.title('Produto')

with col0:
    st.image('assets/product.jpg')

st.write('preço total: ', st.session_state.count*20, 'R$')