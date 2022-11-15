import streamlit as st

col1, col2, col3, col4, col5, col6 = st.columns([1, 20, 3, 2 , 3, 3])

with col2:
    pesquisa = st.text_input("Search for a product")

with col3:
    st.markdown("")
    st.write("")
    st.image("assets/search.jpg")

with col5:
    st.markdown("")
    st.write("")
    st.image("assets/carrin.jpg")

with col6:
    st.markdown("")
    st.write("")
    st.image("assets/thomas_prod.jpg")

icol1, icol2, icol3, icol4 = st.columns([3, 15, 5, 2])

with icol1:
    st.image("assets/product.jpg")
    st.image("assets/product.jpg")
    st.image("assets/product.jpg")

with icol2:
    st.image("assets/product2.jpg", width=400)

with icol3:
    st.markdown("""
    Wow, cringe is here, **THE CRINGE IS HERE**
    """)

st.text("""
    Lorem ipsum dolor sit amet consectetur adipiscing elit, urna consequat felis vehicula class ultricies mollis dictumst, 
    aenean non a in donec nulla. Phasellus ante pellentesque erat cum risus consequat imperdiet aliquam, 
    integer placerat et turpis mi eros nec lobortis taciti, vehicula nisl litora tellus ligula porttitor metus. 

    Vivamus integer non suscipit taciti mus etiam at primis tempor sagittis sit, 
    euismod libero facilisi aptent elementum felis blandit cursus gravida sociis erat ante, 
    eleifend lectus nullam dapibus netus feugiat curae curabitur est ad. 
    Massa curae fringilla porttitor quam sollicitudin iaculis aptent leo ligula euismod dictumst, 
    orci penatibus mauris eros etiam praesent erat volutpat posuere hac. Metus fringilla nec ullamcorper odio aliquam lacinia conubia mauris tempor, 
    etiam ultricies proin quisque lectus sociis id tristique, integer phasellus taciti pretium adipiscing tortor sagittis ligula. 

""")