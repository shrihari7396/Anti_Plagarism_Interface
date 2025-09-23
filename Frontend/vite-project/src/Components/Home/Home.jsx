import React, { useState, useEffect } from 'react';
import { LogIn, PlayCircle } from 'lucide-react';
import './Home.css';
import Navbar from '../Navbar/Navbar.jsx';
import { useNavigate } from 'react-router-dom';

function Home() {
  const navigate = useNavigate();
  localStorage.setItem("Admin_Token" , "tftjhvuyvhcsg")
  const [typedText, setTypedText] = useState('');
  const fullText = "Coding Assessments";
  const [currentIndex, setCurrentIndex] = useState(0);
  const [text, setText] = useState('');

  

  // Retrieve and set name properly
  useEffect(() => {
    const name = localStorage.getItem("Student_Name");
    if (name) {
      setText(name);
    }
  }, []); // Run only once on mount

  // Typing effect logic
  useEffect(() => {
    if (currentIndex < fullText.length) {
      const timeout = setTimeout(() => {
        setTypedText((prev) => prev + fullText[currentIndex]);
        setCurrentIndex((prev) => prev + 1);
      }, 100);

      return () => clearTimeout(timeout);
    }
  }, [currentIndex]);

  useEffect(() => {
    setTypedText('');
    setCurrentIndex(0);
  }, []);

  return (
      <main className="home">
        <Navbar />

        {/* Name Container just below Navbar */}
        {/* In your component */}
        {text && (
            <div className="welcome-master">
              <div className="welcome-sparkle">
                <span className="welcome-icon">✨</span>
                <span className="welcome-text">Welcome,</span>
                <span className="username-glow">{text}</span>
              </div>
            </div>
        )}

        <div className="background-pattern"></div>
        <div className="content-container">
          <div className="content-wrapper">
            <h1 className="main-title">
              Ensuring Integrity in <span className="highlight">{typedText}</span>
            </h1>

            <p className="description">
              Welcome to the Anti Plagiarism Interface (API), your trusted platform for maintaining academic integrity in programming assignments and assessments.
            </p>

            <div className="button-group">
              <button
                  className="primary-button login-button"
                  onClick={() => navigate('/Login')}
              >
                <LogIn className="button-icon" />
                Login
              </button>
              <button
                  className="primary-button start-button"
                  onClick={() => navigate('/Instructions')}
              >
                <PlayCircle className="button-icon" />
                Start Test
              </button>
            </div>

            <p className="description bold">
              You must first Log-in then can click Start button
            </p>

            <div className="info-card">
              <h2 className="card-title">About Our Institution</h2>
              <p className="card-text">
                We are committed to fostering an environment of academic excellence and integrity. Our platform helps educators maintain fair assessment practices while providing students with a secure and user-friendly testing environment.
              </p>
            </div>
          </div>
        </div>
      </main>
  );
}

export default Home;
